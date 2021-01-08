package org.nlt.include;

import java.util.LinkedHashMap;
import java.util.Properties;
import org.nlt.model.Objectives;
import org.nlt.model.Users;
import org.nlt.view.TestExaminationFrame;
import org.nlt.view.InstructionFrame;
import org.nlt.view.LoginFrame;
import org.nlt.view.MainFrame;
import org.nlt.view.ObjectiveFrame;
import org.nlt.view.PracticeExaminationFrame;
import org.nlt.view.SettingFrame;
import org.nlt.view.SignupFrame;
import org.nlt.view.StudentFrame;

public class Config {


    public static MainFrame mainframe = null;
    public static LoginFrame loginframe = null;
    public static SignupFrame signupframe = null;
    public static InstructionFrame instructionframe = null;
    public static StudentFrame studentframe = null;
    public static ObjectiveFrame objectiveframe = null;
    public static SettingFrame settingframe = null;
    public static TestExaminationFrame examinationframe = null;
    public static PracticeExaminationFrame practiceexamination = null;


    public static LinkedHashMap<String, Users> userMap = new LinkedHashMap<>();
    public static LinkedHashMap<String, Objectives> testQuestionobjectiveMap = new LinkedHashMap<>();
         public static LinkedHashMap<String, Objectives> practicequestionobjectiveMap = new LinkedHashMap<>();

    public static Users user;
    public static Properties props = new Properties();
}
