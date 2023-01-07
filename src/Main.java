public class Main {
    public static void main(String[] args) {


            int[][] field = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
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
                if (i < 9 && j < 9 && field[i][j] == 1 && field[i + 1][j] == 0 && field[i][j + 1] == 0) {
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
                if (i == 9 && j < 9 && field[i][j] == 1 && field[i][j + 1] == 0) {
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
                if (i < 9 && j == 9 && field[i][j] == 1 && field[i + 1][j] == 0) {
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
        System.out.println(cnt4);
    }}





