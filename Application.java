public class Application {
    public static void main (String [] args){
        if((args.length != 1) || (args[0] == null) || (args[0].equals("")))
            System.out.println("");

        String s = args[0];

        StringBuilder b = new StringBuilder();
        char temp = s.charAt(0);

        int m = 1;
        for ( int i = 1, d = s.length(); i < d; i++ ){
            if (temp == s.charAt(i)){
                if( m == 9 ){
                    b.append(temp).append(m);
                    m = 1;
                } else m ++;
                if( (temp == s.charAt(i)) && i == s.length() - 1 ){
                    b.append(temp).append(m);
                }

            } else {
                b.append(temp);
                if (m > 1) b.append(m);
                temp = s.charAt(i);
                m = 1;
            }


        }
        System.out.println(b);
    }
}
