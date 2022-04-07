package lecture.week5.problem03;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RocketUI {

	public void getRocketUI() {
		Rocket[] rockets=new Rocket [] { 
				new Rocket("Shooter", 3.95, 50),
				new Rocket("Orbit", 29.95, 5000),
				};

		RocketTable rocketBomb=new RocketTable(rockets);
		JFrame frame =new JFrame();
		JTable table=new JTable(rocketBomb);
		frame.add(new JScrollPane(table));
		frame.setSize(300,400);
		frame.setVisible(true);
	}
}
