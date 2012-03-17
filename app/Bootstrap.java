
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skrzacik
 */
@OnApplicationStart
public class Bootstrap extends Job {
public void doJob() {

//Fixtures.load("conf/initial-data.yml");
}
}