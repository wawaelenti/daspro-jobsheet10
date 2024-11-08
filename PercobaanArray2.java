public class PercobaanArray2 {
    public static void main(String[] args) {
    
        int[][] hasilSurvei = {
            {3,2,3,2,1,5},
            {4,1,2,2,3,5},
            {5,1,3,4,2,1},
            {4,2,2,1,5,5},
            {2,2,3,3,4,4},
            {1,2,3,4,5,2},
            {2,5,3,4,1,1},
            {5,4,3,2,1,5},
            {1,5,3,4,2,2},
            {1,4,5,3,2,3},
        };

        for (int i = 0; i < hasilSurvei.length; i++) {
            double total = 0;
            for (int j = 0; j < hasilSurvei[i].length; j++) {
               total += hasilSurvei[i][j];
            }
            double rata2 = total / hasilSurvei[i].length;
            System.out.printf("Rata-rata responden %d: %.2f%n ", i+1,rata2);
        }

        for (int j = 0; j < hasilSurvei[0].length; j++) {
            double total = 0; 
            for (int i = 0; i < hasilSurvei.length; i++) {
                total += hasilSurvei[i][j]; 
            }
            double rata2 = total / hasilSurvei.length;
            System.out.printf("Rata-rata pertanyaan &d: %.2f%n",j+1,rata2);
        }

            double totalAkhir = 0; 
            int court = 0;
            for (int i = 0; i < hasilSurvei.length; i++) {
                for (int j = 0; j < hasilSurvei.length; j++) {
                    totalAkhir += hasilSurvei[i][j];
                    court++;
                }
            }
            double rataRataKeseluruhan = totalAkhir / court;
            System.out.printf("Rata-rata keseluruhan : %.2f%n ", rataRataKeseluruhan);
        }        
    }

