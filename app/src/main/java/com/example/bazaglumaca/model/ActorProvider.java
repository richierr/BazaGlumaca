package com.example.bazaglumaca.model;

import java.util.Date;
import java.util.List;

public class ActorProvider {
    private static ActorProvider INSTANCE=new ActorProvider();
    private List<Actor> actorList;



    private ActorProvider() {
        actorList.add(new Actor(1,"Clint","Istvud","kaubojac bla bla bla bla","","1.2.1950",null,2.4d));
        actorList.add(new Actor(2,"Arnold","Svarcika","bilder bla bla bla bla","","1.2.1960",null,2.4d));
        actorList.add(new Actor(3,"Silvester","Stalone","boxer bla bla bla bla","","1.2.1966",null,2.4d));
        actorList.add(new Actor(4,"Hemfri","Bogart","baja bla bla bla bla","","1.2.1910","1.2.1960",2.4d));
    }


    public static ActorProvider getINSTANCE(){
        return INSTANCE;
    }

    public List<Actor> getActorList() {
        return actorList;
    }


}
