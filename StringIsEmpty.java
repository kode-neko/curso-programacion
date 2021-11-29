public class Main {
    
    public static void main(String[] args) {
        
        String matrix = "No pienses que lo eres. Sabes que lo eres (Morfeo - Matrix)";
        String word01 = " ";
        String word02 = "";
        String word03 = "	"; // un tabulador
        boolean isNoMatrix = matrix.isEmpty(); // false
        boolean isNoWord01 = word01.isEmpty(); // false
        boolean isNoWord02 = word02.isEmpty(); // true
        boolean isNoWord03 = word03.isEmpty(); // false
        // Los espacios y tabuladores son caractéres
        
        
        System.out.println(isNoMatrix);
    }
}
