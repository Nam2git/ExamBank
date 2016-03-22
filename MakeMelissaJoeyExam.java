

import java.util.Vector;


public class MakeMelissaJoeyExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Melissa & Joey Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What is Melissa profession?"));
            question.setChoiceA(("Senator"));
            question.setChoiceB(("Housewife"));
            question.setChoiceC(("Analyst"));
            question.setChoiceD(("Singer"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        
        {
            Question question = new Question();
            question.setQuery(("What is Joey Profression?"));
            question.setChoiceA(("Analyst"));
            question.setChoiceB(("Doctor"));
            question.setChoiceC(("Lawyer"));
            question.setChoiceD(("Nanny"));
            question.setAnswer(("d"));
            questions.addElement(question);
        }
		 {
            Question question = new Question();
            question.setQuery(("Hiow many kids they have?"));
            question.setChoiceA(("2"));
            question.setChoiceB(("3"));
            question.setChoiceC(("none"));
            question.setChoiceD(("5"));
            question.setAnswer(("c"));
            questions.addElement(question);
        }
		
 {
            Question question = new Question();
            question.setQuery(("This show is ..."));
            question.setChoiceA(("funny"));
            question.setChoiceB(("mystery"));
            question.setChoiceC(("action"));
            question.setChoiceD(("horror"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        return exam;
    }
    }


