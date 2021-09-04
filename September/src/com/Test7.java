package com;
//input=sijk416@gmail.com output=sijk4167 
//extract username(sijk416) from mail count(7) it add at last

public class Test7 {

	public static void main(String[] args) {
		String mail="ismailjabiulla999@gmail.com";
		String[] user=mail.split("@");
		int len=user[0].length();
		System.out.println(user[0]+""+len);
			}

}
/* read mailID
 * user=`echo $mailID| awk -F "@" '{print $1}'`
 * count=`echo $user|awk '{print length}'`
 * echo "$user$count"
 *
 */
