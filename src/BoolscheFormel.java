public class BoolscheFormel {

    public static void main(String[] args) {
        int counter = 0;
        boolean u, v, w, x, y, z;

        for (int i = 0; i < 2; i++) {
            if(i == 0){
                u = false;
            }else{
                u = true;
            }
            for (int j = 0; j < 2; j++) {
                if(j == 0){
                    v = false;
                }else{
                    v = true;
                }
                for (int k = 0; k < 2; k++) {
                    if(k == 0){
                        w = false;
                    }else{
                        w = true;
                    }
                    for (int l = 0; l < 2; l++) {
                        if(l == 0){
                            x = false;
                        }else{
                            x = true;
                        }
                        for (int m = 0; m < 2; m++) {
                            if(m == 0){
                                y = false;
                            }else{
                                y = true;
                            }
                            for (int n = 0; n < 2; n++) {
                                if(n == 0){
                                    z = false;
                                }else{
                                    z = true;
                                }

                                if(!(u && v || w && !x || y && z && !u  || z && v && !y  ||
                                        (x && (y || !(x && z && w) && !(y  ||  z)))&&!(!z && !y  || y&& x && !z))){
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
