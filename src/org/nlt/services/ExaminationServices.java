/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.nlt.include.DatabaseConnection;
import org.nlt.model.ExamResults;
import org.nlt.model.Examinations;
import org.nlt.model.Users;
public class ExaminationServices {
    public static void addExamResult(ExamResults examResult) {
        org.hibernate.Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.save(examResult);
        ses.getTransaction().commit();
    }
     public static void addExaminationQuestion(Examinations examination)//this method will receive USers object add in database
    {
         org.hibernate.Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.save(examination);
        ses.getTransaction().commit();
    }
      public static List<Examinations> getExaminations(Users loginUser) {
         org.hibernate.Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Examinations where status=1 and user_id=" + loginUser.getId());
        List<Examinations> examinationList = query.list();
        return examinationList;
    }
}
