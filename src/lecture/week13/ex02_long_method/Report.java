package lecture.week13.ex02_long_method;

import java.util.*;
import java.io.*;
import java.util.List;

public class Report {
    public static void report(Writer out, List<Machine> machines, Robot robot)
            throws IOException 
    {
        printTitle(out);
        printMachines(out, machines);
        printRobotInfo(out, robot);
        printFooter(out);
    }

    public static void printTitle(Writer out) throws IOException {
        out.write("FACTORY REPORT\n");
    }

    public static void printMachines(Writer out, List<Machine> machines) throws IOException {
        Iterator<Machine> line = machines.iterator();
        while (line.hasNext()) {
            Machine machine = (Machine) line.next();
            out.write("Machine " + machine.name());

            if (machine.bin() != null)
                out.write(" bin=" + machine.bin());

            out.write("\n");
        }
        out.write("\n");

    }

    public static void printRobotInfo(Writer out, Robot robot) throws IOException {
        out.write("Robot");
        if (robot.location() != null)
            out.write(" location=" + robot.location().name());

        if (robot.bin() != null)
            out.write(" bin=" + robot.bin());

        out.write("\n");
    }

    public static void printFooter(Writer out) throws IOException {
        out.write("========\n");
    }
}