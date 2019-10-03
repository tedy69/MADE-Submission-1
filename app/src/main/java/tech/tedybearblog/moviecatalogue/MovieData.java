package tech.tedybearblog.moviecatalogue;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][]{
            {"Aquaman", "December 7, 2018","Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world.\n" +
                    "\n" +
                    "Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.", "https://image.tmdb.org/t/p/original/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg","English","144 min","$160,000,000","$1,143,689,193"},
            {"Avengers: Infinity War","April 25, 2018","As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality.\n" +
                    "\n" +
                    "Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.","https://i.pinimg.com/564x/4d/66/7c/4d667c8e7e2a3f33a4958bc5b27048a6.jpg","English","149 min","$300,000,000","$2,046,239,637"},
            {"Avengers: Endgame","April 24, 2019","After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos.\n" +
                    "\n" +
                    " With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg","English","181 min","$2,046,239,637","$2,795,486,053"},
            {"Bohemian Rhapsody", "October 24, 2018","Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.","https://image.tmdb.org/t/p/original/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg","English","135 min","$52,000,000","$894,027,543"},
            {"BumbleBee", "December 15, 2018", "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.", "https://image.tmdb.org/t/p/original/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg","English", "116 min", "$135,000,000", "$465,895,025"},
            {"Creed II", "November 21, 2018","Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.","https://image.tmdb.org/t/p/original/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg","English","130 min","$50,000,000","$137,944,327"},
            {"Fast and Furios: Hobbs and Shaw", "August 1, 2019","A spinoff of The Fate of the Furious, focusing on Johnson's US Diplomatic Security Agent Luke Hobbs forming an unlikely alliance with Statham's Deckard Shaw.","https://image.tmdb.org/t/p/original/keym7MPn1icW1wWfzMnW3HeuzWU.jpg","English", "136 min","$200,000,000","$346,811,600"},
            {"Men In Black: International", "June 14, 2019","The Men in Black have always protected the Earth from the scum of the universe. In this new adventure, they tackle their biggest, most global threat to date: a mole in the Men in Black organization.","https://image.tmdb.org/t/p/original/dPrUPFcgLfNbmDL8V69vcrTyEfb.jpg","English","115 min","$110,000,000","$183,364,926"},
            {"Spiderman: Far From Home","June 28, 2019", "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent", "https://image.tmdb.org/t/p/original/rjbNpRMoVvqHmhmksbokcyCr7wn.jpg","English","129 min","$160,000,000","$1,098,920,975"},
            {"Venom", "September 28, 2018","Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.", "https://image.tmdb.org/t/p/original/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg","English","112 min","$116,000,000","$855,013,954"},
    };

    public static ArrayList<Movie> getListData(){
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data){
            Movie movie = new Movie();
            movie.setName(aData[0]);
            movie.setFrom(aData[1]);
            movie.setContent(aData[2]);
            movie.setPhoto(aData[3]);
            movie.setPoster(aData[3]);
            movie.setLanguage(aData[4]);
            movie.setRuntime(aData[5]);
            movie.setBudget(aData[6]);
            movie.setRevenue(aData[7]);

            list.add(movie);
        }

        return list;
    }
}
