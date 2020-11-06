package exerciseA;
/*
 * Subject.java
 * Lab:7-Exercise A
 * Completed by: Ziad Chemali and Lotfi Hasni
 * Submission DAte: November 6 ,2020
 */
public interface Subject {
public void addObserver(Observer observer);
public void remove(Observer observer) ;
public void notifAll();	

}
