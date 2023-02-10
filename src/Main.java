import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // двоичные числа
      /*byte x = 0b10; //зпись двоичного числа
       byte y = 0b11;
       int a = scanner.nextInt(2); // ввод двоичного числа
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
//Расстояние между двумя точками земли
/*//        Введите широту координаты Новосибирска x1
//        Введите долготу координаты Новосибирска y1
//        Введите широту координаты Москвы x2
//        Введите долготу координаты Москвы y2
        double  r = 6371.01;//километров
        double x1= 55.01;
        double y1 = 82.55;
        double x2 = 55.44;
        double y2 = 37.36;
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

double S = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println(S);//километров*/
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
//Подсчет разных символов в строке
        /*String str = "Aa kiu, я swd skieo 236587. GH kiu: sieo ?? 25,33 Привет";
        char[] chs = str.toCharArray();
        int count1 = 0;//буквы
        int count2 = 0;//цифры
        int count3 = 0;//пробелы
        int count4 = 0;//другие символы
        for (char ch : chs) {
            if (Character.isDigit(ch)) {
                count2++;
            } else if (Character.isLetter(ch)) {
                count1++;
            } else if (Character.isWhitespace(ch)) {
                count3++;
            }
        }
        count4 = str.length() - count2 - count1 - count3;
        System.out.println("Букв: " + count1);
        System.out.println("Цифр: " + count2);
        System.out.println("Пробелов: " + count3);
        System.out.println("Других символов: " + count4);*/
    }

}





