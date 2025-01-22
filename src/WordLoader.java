import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordLoader {

    public ArrayList<String> loadWords(String filePath) {
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        return words;
    }

    public ArrayList<String> getDefaultWords() {
        ArrayList<String> defaultWords = new ArrayList<>();
        defaultWords.add("laptop");
        defaultWords.add("keyboard");
        defaultWords.add("mouse");
        defaultWords.add("headphones");
        return defaultWords;

    }


//  Champions in league of legends

//    public ArrayList<String> getDefaultWords() {
//        ArrayList<String> defaultWords = new ArrayList<>();
//        defaultWords.add("katarina");
//        defaultWords.add("akali");
//        defaultWords.add("gnar");
//        defaultWords.add("thresh");
//        defaultWords.add("aatrox");
//        defaultWords.add("ahri");
//        defaultWords.add("akshan");
//        defaultWords.add("alistar");
//        defaultWords.add("ambesa");
//        defaultWords.add("amumu");
//        defaultWords.add("anivia");
//        defaultWords.add("annie");
//        defaultWords.add("aphelios");
//        defaultWords.add("ashe");
//        defaultWords.add("aurelionsol");
//        defaultWords.add("aurora");
//        defaultWords.add("azir");
//        defaultWords.add("bardo");
//        defaultWords.add("belveth");
//        defaultWords.add("blitzcrank");
//        defaultWords.add("brand");
//        defaultWords.add("braum");
//        defaultWords.add("briar");
//        defaultWords.add("caitlyn");
//        defaultWords.add("camille");
//        defaultWords.add("cassiopeia");
//        defaultWords.add("chogath");
//        defaultWords.add("corki");
//        defaultWords.add("darius");
//        defaultWords.add("diana");
//        defaultWords.add("drmundo");
//        defaultWords.add("draven");
//        defaultWords.add("ekko");
//        defaultWords.add("elise");
//        defaultWords.add("evelynn");
//        defaultWords.add("ezreal");
//        defaultWords.add("fiddlesticks");
//        defaultWords.add("fiora");
//        defaultWords.add("fizz");
//        defaultWords.add("galio");
//        defaultWords.add("gangplank");
//        defaultWords.add("garen");
//        defaultWords.add("gragas");
//        defaultWords.add("gwen");
//        defaultWords.add("hecarim");
//        defaultWords.add("heimerdinger");
//        defaultWords.add("hwei");
//        defaultWords.add("illaoi");
//        defaultWords.add("irelia");
//        defaultWords.add("ivern");
//        defaultWords.add("jarvaniv");
//        defaultWords.add("jax");
//        defaultWords.add("jayce");
//        defaultWords.add("jhin");
//        defaultWords.add("jinx");
//        defaultWords.add("ksante");
//        defaultWords.add("kaisa");
//        defaultWords.add("kalista");
//        defaultWords.add("karma");
//        defaultWords.add("karthus");
//        defaultWords.add("kassadin");
//        defaultWords.add("kayle");
//        defaultWords.add("kayn");
//        defaultWords.add("kennen");
//        defaultWords.add("kha'zix");
//        defaultWords.add("kindred");
//        defaultWords.add("kled");
//        defaultWords.add("kog'maw");
//        defaultWords.add("leblanc");
//        defaultWords.add("leesin");
//        defaultWords.add("leona");
//        defaultWords.add("lillia");
//        defaultWords.add("lissandra");
//        defaultWords.add("lucian");
//        defaultWords.add("lulu");
//        defaultWords.add("lux");
//        defaultWords.add("malphite");
//        defaultWords.add("malzahar");
//        defaultWords.add("maokai");
//        defaultWords.add("masteryi");
//        defaultWords.add("milio");
//        defaultWords.add("missfortune");
//        defaultWords.add("mordekaiser");
//        defaultWords.add("morgana");
//        defaultWords.add("naafiri");
//        defaultWords.add("nami");
//        defaultWords.add("nasus");
//        defaultWords.add("nautilus");
//        defaultWords.add("neeko");
//        defaultWords.add("nidalee");
//        defaultWords.add("nilah");
//        defaultWords.add("nocturne");
//        defaultWords.add("nunuewillump");
//        defaultWords.add("olaf");
//        defaultWords.add("orianna");
//        defaultWords.add("ornn");
//        defaultWords.add("pantheon");
//        defaultWords.add("poppy");
//        defaultWords.add("pyke");
//        defaultWords.add("qiyana");
//        defaultWords.add("quinn");
//        defaultWords.add("rakan");
//        defaultWords.add("rammus");
//        defaultWords.add("rek'sai");
//        defaultWords.add("rell");
//        defaultWords.add("renataglasc");
//        defaultWords.add("renekton");
//        defaultWords.add("rengar");
//        defaultWords.add("riven");
//        defaultWords.add("rumble");
//        defaultWords.add("ryze");
//        defaultWords.add("samira");
//        defaultWords.add("sejuani");
//        defaultWords.add("senna");
//        defaultWords.add("seraphine");
//        defaultWords.add("sett");
//        defaultWords.add("shaco");
//        defaultWords.add("shen");
//        defaultWords.add("shyvana");
//        defaultWords.add("singed");
//        defaultWords.add("sion");
//        defaultWords.add("sivir");
//        defaultWords.add("skarner");
//        defaultWords.add("smolder");
//        defaultWords.add("sona");
//        defaultWords.add("soraka");
//        defaultWords.add("swain");
//        defaultWords.add("sylas");
//        defaultWords.add("syndra");
//        defaultWords.add("teemo");
//        defaultWords.add("tahmkench");
//        defaultWords.add("taliyah");
//        defaultWords.add("talon");
//        defaultWords.add("taric");
//        defaultWords.add("tristana");
//        defaultWords.add("trundle");
//        defaultWords.add("tryndamere");
//        defaultWords.add("twistedfate");
//        defaultWords.add("twitch");
//        defaultWords.add("udyr");
//        defaultWords.add("urgot");
//        defaultWords.add("varus");
//        defaultWords.add("vayne");
//        defaultWords.add("veigar");
//        defaultWords.add("vel'koz");
//        defaultWords.add("vex");
//        defaultWords.add("vi");
//        defaultWords.add("viego");
//        defaultWords.add("viktor");
//        defaultWords.add("vladimir");
//        defaultWords.add("volibear");
//        defaultWords.add("warwick");
//        defaultWords.add("wukong");
//        defaultWords.add("xayah");
//        defaultWords.add("xerath");
//        defaultWords.add("xinzhao");
//        defaultWords.add("yasuo");
//        defaultWords.add("yone");
//        defaultWords.add("yorick");
//        defaultWords.add("yummi");
//        defaultWords.add("zac");
//        defaultWords.add("zed");
//        defaultWords.add("zeri");
//        defaultWords.add("ziggs");
//        defaultWords.add("zilean");
//        defaultWords.add("zoe");
//        defaultWords.add("zyra");
//
//        return defaultWords;
//    }
}
