/*
 * Copyright (c) Liza Rajput. All rights reserved.
 * MUET. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * Portions Copyright 14SW13. All Rights Reserved.
 */


import java.io.*;
import java.util.*;

/**
 * Immutable objects which describe certain rules for inserting and deleting, such as those
 * implemented by the basic mathematical operators.
 *
 * <p>The base-independent settings are:
 * <ol>
 * <li>{@code precision}:
 * the number of basic operations for such are
 *
 * @see     uppercase,lowercase
 * @author  Liza Rajput (14SW13)
 * @since 1.5
 */

public final class StringApi{
	/*
	*
	* initializing variables which will be used for storing values
	* initializing methods which will be used for this class
	*/

	public String lowercase(String a){
	String str="";
	for(int i=0;i<a.length();i++)
	{char na=a.charAt(i);
	na+=32;
	str+=na;
	}
	return str;
}



	public  String uppercase(String a){
	String str="";
	for(int i=0;i<a.length();i++)
	{char na=a.charAt(i);
	na-=32;
	str+=na;
	}
	return str;
}

}