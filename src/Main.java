import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // двоичные числа
      /*byte x = 0b10; //зпись двоичного числа
       byte y = 0b11;
       int a = scanner.nextInt(2); // вврд двоичного числа
       int c = scanner.nextInt(2);
        int d = a*c;
        String s = "110";
        int et = Integer.parseInt(s, 2); // перевод строики в двоичное число
        System.out.println(Integer.toBinaryString(d)); // вывод двоичного числа из int
        System.out.println(Integer.toBinaryString(et));
        System.out.println(a); //вывод десятичного числа из двоичного*/
//шестнадцатиричные числа
       /* int num = scanner.nextInt();
        int num2 = num;
        String s = "";
        int oststok;
        String ostV16="";
        while (num>0){
            oststok = num%16;
            if (oststok ==15){
                ostV16 = "F";
            } else if (oststok ==14) {
                ostV16 = "E";
            } else if (oststok ==13) {
                ostV16 = "D";
            } else if (oststok ==12) {
                ostV16 = "C";
            } else if (oststok ==11) {
                ostV16 = "B";
            } else if (oststok ==10) {
                ostV16 = "A";
            } else if (oststok <=9) {
                ostV16= Integer.toString(oststok);
            }
            s=ostV16+s;
            num/=16;
        }
String stringNum=Integer.toString(num2, 16);
        System.out.println(s);
        System.out.println(stringNum);*/
        //восьмеричное число
        /*int num = scanner.nextInt();
        String stringNum8 = Integer.toString(num, 8);
        System.out.println(stringNum8);*/
//проверка java на компьютере
        /*System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.class.path"));*/
//площвдь многоугольника, где а - длина стороны, n - кол. сторон
        /*int a= 6;
        int n = 7;
        double S = n * Math.pow(a, 2) / (4 * Math.tan(Math.PI / n));
        System.out.println(S);*/


//подсчет кораблей для морского боя
            /*int[][] field = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 1}};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < 9 && j < 9 && field[i][j] == 1 && field[i + 1][j] !=1 && field[i][j + 1] !=1) {
                    int cnt = 1;
                    for (int a = i-1; a>i-4; a--) {

                        if (a>=0&&field[a][j] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    for (int b = j-1; b>j-4; b--) {

                        if (b>=0&&field[i][b] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    if (cnt == 4) {
                        cnt4++;
                    } else if (cnt == 3) {
                        cnt3++;
                    } else if (cnt == 2) {
                        cnt2++;
                    } else if (cnt == 1) {
                        cnt1++;
                    }
                }
                if (i == 9 && j < 9 && field[i][j] == 1 && field[i][j + 1] !=1) {
                    int cnt = 1;
                    for (int a = i-1; a>i-4; a--) {

                        if (a>=0&&field[a][j] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    for (int b = j-1; b>j-4; b--) {

                        if (b>=0&&field[i][b] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    if (cnt == 4) {
                        cnt4++;
                    } else if (cnt == 3) {
                        cnt3++;
                    } else if (cnt == 2) {
                        cnt2++;
                    } else if (cnt == 1) {
                        cnt1++;
                    }

                }
                if (i < 9 && j == 9 && field[i][j] == 1 && field[i + 1][j] !=1) {
                    int cnt = 1;
                    for (int a = i-1; a>i-4; a--) {

                        if (a>=0&&field[a][j] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    for (int b = j-1; b>j-4; b--) {

                        if (b>=0&&field[i][b] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    if (cnt == 4) {
                        cnt4++;
                    } else if (cnt == 3) {
                        cnt3++;
                    } else if (cnt == 2) {
                        cnt2++;
                    } else if (cnt == 1) {
                        cnt1++;
                    }
                }
                if (i == 9 && j == 9 && field[i][j] == 1) {
                    int cnt = 1;
                    for (int a = i-1; a>i-4; a--) {

                        if (a>=0&&field[a][j] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    for (int b = j-1; b>j-4; b--) {

                        if (b>=0&&field[i][b] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    if (cnt == 4) {
                        cnt4++;
                    } else if (cnt == 3) {
                        cnt3++;
                    } else if (cnt == 2) {
                        cnt2++;
                    } else if (cnt == 1) {
                        cnt1++;
                    }
                }

            }
        }
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
        System.out.println(cnt4);*/

    }

}





