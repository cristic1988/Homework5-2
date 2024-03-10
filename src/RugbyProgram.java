public class RugbyProgram {

    public static void main (String[] args){

        String rugbyTeam1 = "Red";
        String rugbyTeam2 = "Blue";
        System.out.print("Age of players team " +  rugbyTeam1 + ": " );
        int[] agePlayersTeam1 = new int[]{18, 25, 31, 22, 34, 26, 30, 25, 35, 40, 28, 18, 22, 35, 30, 28, 39, 22, 31, 26, 35, 24, 18, 20, 22};
        for (int age1: agePlayersTeam1){
            System.out.print(age1 + ", ");
        }
        System.out.println();
        System.out.print("Age of players team " +  rugbyTeam2 + ": " );
        int[] agePlayersTeam2 = new int[]{31, 25, 24, 38, 37, 18, 22, 38, 31, 18, 20, 22, 19, 18, 35, 26, 18, 35, 37, 18, 18, 20, 27, 33, 29,};
        for (int age2: agePlayersTeam2){
            System.out.print(age2 + ", ");
        }

        System.out.println();

        System.out.print("Average age of team " +  rugbyTeam1 + ": " );
        int sum1 = 0;
        for (int age1: agePlayersTeam1){
            sum1 +=age1;
        }
        System.out.println((int)((double) (sum1 / agePlayersTeam1.length)));

        System.out.println();

        System.out.print("Average age of team" +  rugbyTeam2 + ": " );
        int sum2 = 0;
        for (int age2: agePlayersTeam2){
            sum2 +=age2;
        }
        System.out.println((int)((double) (sum2 / agePlayersTeam2.length)));



    }
}
