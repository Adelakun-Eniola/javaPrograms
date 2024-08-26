
    class PrimeFinder {
        public static void main(String[] args) {
            Boolean prime;
            for (int n = 2; n < 100; n++) {
                prime = true;
                if ((n % 2) == 0)
                    prime = false;
                else {
                    for (int x = 3; x <= (n / 2); x+=2) {
                        if ((n % x) == 0) {
                            prime = false;
                            break;
                        }
                    }
                }
                if (prime)
                    System.out.print(n + " ");
                else
                    continue;
            }
        }
    }

