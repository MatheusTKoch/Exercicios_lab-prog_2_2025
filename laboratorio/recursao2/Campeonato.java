package recursao2;

public class Campeonato {
    private TimeCampeonato[] times;

    public Campeonato() {
        // Variavel nao inicializada
    }

    public void setTimeCampeonato(TimeCampeonato[] times) {
        this.times = times;
    }

    public TimeCampeonato[] getTimeCampeonato() {
        return times;
    }

    public void leArquivo(String fileName) {
        try {
            String path = System.getProperty("user.dir") + "\\laboratorio\\recursao2\\" + fileName;
            System.out.println("Tentando ler arquivo em: " + path);
            java.nio.file.Path filePath = java.nio.file.Paths.get(path);
            java.util.List<String> lines = java.nio.file.Files.readAllLines(filePath);
            
            //Criar array
            java.util.Set<String> uniqueTeams = new java.util.HashSet<>();
            
            // Processar nomes de equipe
            for (String line : lines) {
                String[] parts = line.split(" x ");
                String[] team1Parts = parts[0].trim().split(" ");
                String[] team2Parts = parts[1].trim().split(" ");
                
                uniqueTeams.add(team1Parts[0]);
                uniqueTeams.add(team2Parts[1]);
            }
            
            times = new TimeCampeonato[uniqueTeams.size()];
            java.util.Map<String, TimeCampeonato> teamMap = new java.util.HashMap<>();
            
            int index = 0;
            for (String teamName : uniqueTeams) {
                times[index] = new TimeCampeonato(teamName, 0);
                teamMap.put(teamName, times[index]);
                index++;
            }
            
            // Calculo do saldo
            for (String line : lines) {
                String[] parts = line.split(" x ");
                String[] team1Parts = parts[0].trim().split(" ");
                String[] team2Parts = parts[1].trim().split(" ");
                
                String team1Name = team1Parts[0];
                String team2Name = team2Parts[1];
                int team1Score = Integer.parseInt(team1Parts[1]);
                int team2Score = Integer.parseInt(team2Parts[0]);
                
                TimeCampeonato team1 = teamMap.get(team1Name);
                TimeCampeonato team2 = teamMap.get(team2Name);
                
                // Update saldo de gols
                team1.setSaldo(team1.getSaldo() + (team1Score - team2Score));
                team2.setSaldo(team2.getSaldo() + (team2Score - team1Score));
            }
            
        } catch (java.io.IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public TimeCampeonato timeMaiorSaldoGols() {
        if (times == null || times.length == 0) {
            return null;
        }
        return timeMaiorSaldoGols(times, 0, times[0]);
    }

    private TimeCampeonato timeMaiorSaldoGols(TimeCampeonato[] times, int index, TimeCampeonato maiorTime) {
        if (index >= times.length) {
            return maiorTime;
        }
        
        if (times[index].getSaldo() > maiorTime.getSaldo()) {
            maiorTime = times[index];
        }
        
        return timeMaiorSaldoGols(times, index + 1, maiorTime);
    }
}
