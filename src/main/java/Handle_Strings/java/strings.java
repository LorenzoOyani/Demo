package Handle_Strings.java;

import java.util.Arrays;

public class strings {
    public void main(String[] args) {
        String s = "java";
        s = "James";   // dereferencing
        System.out.println(s);


        // interned string
        char[] s2 = new char[]{'J','a','v','a' };
        String s3 = String.valueOf(s2);

        char[] chars = new char[1000];
        System.arraycopy(s2, 0, chars, 0, s2.length);
        for(int i =0; i < s3.length(); i++) {
           chars[i] = Character.toUpperCase(chars[i]);
        }

        String k = String.valueOf(chars).replace("J", "j");
        System.out.println(k);
        if(Arrays.equals(chars, s2)){
            System.out.println("s1 and s3 is are equal \n" );
        } else {
            System.exit(1);
        }
//        System.out.println(STR."s1 and s2 is \n\{chars == s2.toCharArray()}");
        //Replacing and splitting strings.=

//        String j = s1.replaceAll("Welcome", "pussy");
//        System.out.println(j);


        String[] tokens = "java#HTML#C#".split("#");
        String[] toks = "Java,C?,C#,$".split("[,.?,#,$]");


        for (int i = 0; i < toks.length; i++) {
            System.out.print(toks[i] + " ");
        }
        String m = String.valueOf("Java is fun".matches(" .*.Java.*"));

        System.out.println(m + "\n");
        char[] charss = "Java".toCharArray();
        char c = charss[1];
        System.out.println(c);
//        char[] dst = {'J', 'A', 'V', 'A', '1', '3', 'P'};
//        "37098".getChars(new char[]{2, 6,dst,7});
//        char[] dst = {'J', 'A', 'V', 'A', '1', '3', 'P'};
//        "37098".getChars(2, 7, dst, 3);
//        System.out.println(dst);
        String str = String.valueOf(new char[]{'J', 'A', 'V', 'A'});
        System.out.println(str);

        System.out.println("Hi, ABC".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",.;", "#"));


        int count = 0;
        char[] characters;
        characters = new char[]{'J', 'a', 'v', 'a'};
        String kk = String.valueOf(characters);
        for (int i = 0; i < kk.length(); i++) {
            if (Character.isLowerCase(kk.charAt(i))) {
                characters[i] = Character.toUpperCase(kk.charAt(2));
            }
            count++;

        }
        // stringBuilder and stringBuffer can be used in place of a string.
        String strings = "Welcome to my house and Java";
        StringBuilder ss = new StringBuilder();
        ss.append(strings);
        ss.delete(11, 23);
        System.out.println(ss);
        ss.reverse();
        System.out.println(ss);
//
//        System.out.println();

    }


}
//immutability of a string
// String classes like matches, and equals all return a boolean value;
// split, split the string objects and return a new string of objects.
//Regular expressions.