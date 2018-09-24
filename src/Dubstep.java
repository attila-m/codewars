public class Dubstep {

  public static void main(String[] args) {
    System.out.println(SongDecoder("WUBWUBPLSWUBWUBWUBDONTWUB"));
  }

  public static String SongDecoder (String song) {
    String decodedSong =  song.replace("WUB"," ")
            .trim()
            .replaceAll("\\s+"," ");
      return decodedSong;
  }
}
