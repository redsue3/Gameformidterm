    public class Khm20221016_mid2 {

        public static String comCh() {
            long time = System.currentTimeMillis();
            int chNum = (int) (time % 3);
            if (chNum == 0) return "가위";
            if (chNum == 1) return "바위";
            return "보";
        }

        public static String userCh() {
            long time = System.currentTimeMillis() * 17 + 13; 
            int chNum = (int) (time % 3);
            if (chNum == 0) return "가위";
            if (chNum == 1) return "바위";
            return "보";
        }

        public static String win(String user, String com) {
            System.out.println("사용자 선택: " + user);
            System.out.println("컴퓨터 선택: " + com);
            if (user.equals(com)) {
                return "무승부";
            } else if (user.equals("가위") && com.equals("보")) {
                return "사용자 승!";
            } else if (user.equals("바위") && com.equals("가위")) {
                return "사용자 승!";
            } else if (user.equals("보") && com.equals("바위")) {
                return "사용자 승!";
            } else {
                return "컴퓨터 승!";
            }
        }

        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int userScore = 0;
            int computerScore = 0;
            int round = 1;

            System.out.println("3판 2선승제 가위, 바위, 보 게임 시작!");

            while (userScore < 2 && computerScore < 2) {
                System.out.println("\n" + round + "번째 판:");
                System.out.println("가위, 바위, 보 중 하나를 입력하세요:");
                String userChoice = scanner.nextLine();
                while (!userChoice.equals("가위") && !userChoice.equals("바위") && !userChoice.equals("보")) {
                    System.out.println("잘못된 입력입니다. 가위, 바위, 보 중 하나를 정확히 입력하세요:");
                    userChoice = scanner.nextLine();
                }
                String computerChoice = comCh();
                String result = win(userChoice, computerChoice);
                System.out.println("이번 판 결과: " + result);

                if (result.equals("사용자 승!")) userScore++;
                if (result.equals("컴퓨터 승!")) computerScore++;

                System.out.println("현재 점수 - 사용자: " + userScore + ", 컴퓨터: " + computerScore);
                round++;
            }

            System.out.println("\n최종 결과:");
            if (userScore > computerScore) System.out.println("사용자 최종 승리!");
            else System.out.println("컴퓨터 최종 승리!");

            scanner.close();
        }
    }