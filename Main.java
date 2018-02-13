package BrugerAutorisation;

public class Main {

    public static void main(String[] args){
        Brugeradmin b = new BrugeradminImplService().getBrugeradminImplPort();
        Bruger bruger = b.hentBruger("s133018", "ilovedota");
        System.out.println(bruger.brugernavn);

    }
}
