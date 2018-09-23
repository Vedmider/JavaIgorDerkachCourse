public class ApplicationDecoder {
    public static void main (String [] args){
        if((args.length != 1) || (args[0] == null) || (args[0].equals(""))){
            System.out.println("");
            return;
        }

        //set parameters
        String s = args[0];
        StringBuilder b = new StringBuilder();


        //parsing args[0] String to satisfy all conditions
        if(Character.isDigit(s.charAt(0))){
            System.out.println("");
            return;
        }
        for(int i = 0; i < s.length(); i++){

            if(i < s.length()-1) {
                if ((s.charAt(i) == s.charAt(i + 1))) {
                    System.out.println("");
                    return;
                }
                if ((Character.isDigit(s.charAt(i))) && (Character.isDigit(s.charAt(i + 1)))) {
                    System.out.println("");
                    return;
                }
            }


        }

        //decoding Application parameters


        for ( int i = 0, d = s.length(); i < d; i++ ){

            if( (i == d - 1) && Character.isLetter(s.charAt(i)) ){
                b.append(s.charAt(i));
                continue;

            }

            if( Character.isLetter(s.charAt(i)) ){
                if( Character.isDigit(s.charAt(i+1)) ){
                    for(int v = 0, z = Character.getNumericValue(s.charAt(i+1)); v < z; v++) {
                        b.append(s.charAt(i));
                    }

                } else b.append(s.charAt(i));
            }

        }
        System.out.println(b);
    }
}
