public class Khm20221016_mid1 {

    public static String comCh() {
        long time = System.currentTimeMillis();
        int chNum = (int) (time % 3);
        if (chNum == 0) {
            return "가위";
        } else if (chNum == 1) {
            return "바위";
        } else {
            return "보";
        }
    }

    public static String userCh() {
        long time = System.currentTimeMillis() * 2 + 7;
        int chNum = (int) (time % 3);
        if (chNum == 0) {
            return "가위";
        } else if (chNum == 1) {
            return "바위";
        } else {
            return "보";
        }
    }

    public static String win(String user, String com) {
        System.out.println("사용자 선택: " + user);
        System.out.println("컴퓨터 선택: " + com);
        if (user.equals(com)) {
            return "무승부";
        } else if (
            (user.equals("가위") && com.equals("보")) ||
            (user.equals("바위") && com.equals("가위")) ||
            (user.equals("보") && com.equals("바위"))
        ) {
            return "사용자 승!";
        } else {
            return "컴퓨터 승!";
        }
    }

    public static void main(String[] args) {
        System.out.println("가위, 바위, 보 게임 시작!");

        String comChoice = comCh();
        String userChoice = userCh();

        String result = win(userChoice, comChoice);
        System.out.println("결과: " + result);
    }
}