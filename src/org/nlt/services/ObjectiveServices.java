package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.nlt.include.DatabaseConnection;
import org.nlt.model.Objectives;
import org.nlt.model.Users;

public class ObjectiveServices {
     public static List<Objectives> getTestObjectiveQuestionList() {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Objectives where status=1");
        List<Objectives> objectiveList = query.list();
        ses.getTransaction().commit();
        return objectiveList;//will return list of users object 
    }
      public static List<Objectives> getPracticeObjectiveQuestionList() {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Objectives where status=2");
        List<Objectives> objectiveList = query.list();
        ses.getTransaction().commit();
        return objectiveList;//will return list of users object 
    }
    public  static void addObjective(Objectives objectives)
    {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.save(objectives);
        ses.getTransaction().commit();
    }
    public  static void updateObjective(Objectives objectives)
    {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.update(objectives);
        ses.getTransaction().commit();
    }
}
