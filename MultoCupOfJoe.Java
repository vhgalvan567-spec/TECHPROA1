public class Multo {
    public static void main(String[] args) {
        String[] lyrics = {
            "Humingang malalim, pumikit na muna",
            "At baka-sakaling namamalikmata lang",
            "Ba't nababahala? 'Di ba't ako'y mag-isa?",
            "'Kala ko'y payapa, boses mo'y tumatawag pa",
            "Binaon naman na ang lahat",
            "Tinakpan naman na 'king sugat",
            "Ngunit ba't ba andito pa rin?",
            "Hirap na 'kong intindihin",
            "Tanging panalangin, lubayan na sana",
            "Dahil sa bawat tingin, mukha mo'y nakikita",
            "Kahit sa'n man mapunta ay anino mo'y kumakapit sa 'king kamay",
            "Ako ay dahan-dahang nililibing nang buhay pa",
            "Hindi na makalaya",
            "Dinadalaw mo 'ko bawat gabi",
            "Wala mang nakikita",
            "Haplos mo'y ramdam pa rin sa dilim",
            "Hindi na nananaginip",
            "Hindi na ma-makagising",
            "Pasindi na ng ilaw",
            "Minumulto na 'ko ng damdamin ko",
            "Ng damdamin ko",
            "Hindi mo ba ako lilisanin?",
            "Hindi pa ba sapat pagpapahirap sa 'kin? (Damdamin ko)",
            "Hindi na ba ma-mamamayapa?",
            "Hindi na ba ma-mamamayapa?",
            "Hindi na makalaya",
            "Dinadalaw mo 'ko bawat gabi",
            "Wala mang nakikita",
            "Haplos mo'y ramdam pa rin sa dilim",
            "Hindi na nananaginip",
            "Hindi na ma-makagising",
            "Pasindi na ng ilaw",
            "Minumulto na 'ko ng damdamin ko",
            "Ng damdamin ko",
            "Makalaya hindi mo ba ako lilisanin",
            "Dinadalaw mo 'ko bawat gabi (hindi pa ba sapat pagpapahirap sa 'kin)",
            "Wala mang nakikita (hindi na ba ma-mamamayapa)",
            "Haplos mo'y ramdam pa rin sa dilim hindi na ba ma-mamamayapa"
        };

        System.out.println("--- Now Playing: Multo by Cup of Joe ---\n");

        for (String line : lyrics) {
            System.out.println(line);
            try {
                // Eto yung nagpapa-bagal ng output (2000 milliseconds = 2 seconds)
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.err.println("Nagkaroon ng error sa pag-play.");
            }
        }
    }
}