package com.example.assienment1;

import java.util.ArrayList;
import java.util.List;

public class data {

    private List<course> level1 = new ArrayList<course>();
    private List<course> level2 = new ArrayList<course>();
    private List<course> level3 = new ArrayList<course>();

    public data() {
        course c1 = new course("Mathematics", new ArrayList<>());
        c1.getSubject().add(new subject("Algebra"));
        c1.getSubject().add(new subject("Geometry"));
        c1.getSubject().add(new subject("Trigonometry"));
        c1.getSubject().add(new subject("Calculus"));
        c1.getSubject().add(new subject("Statistics"));
        c1.getSubject().add(new subject("Probability"));
        c1.getSubject().add(new subject("Discrete Mathematics"));
        level1.add(c1);

        course c2 = new course("English Language", new ArrayList<>());
        c2.getSubject().add(new subject("Reading"));
        c2.getSubject().add(new subject("Writing"));
        c2.getSubject().add(new subject("Grammar"));
        c2.getSubject().add(new subject("Literature"));
        c2.getSubject().add(new subject("Public Speaking"));
        c2.getSubject().add(new subject("Creative Writing"));
        c2.getSubject().add(new subject("Poetry"));
        level1.add(c2);

        course c3 = new course("Science", new ArrayList<>());
        c3.getSubject().add(new subject("Biology"));
        c3.getSubject().add(new subject("Chemistry"));
        c3.getSubject().add(new subject("Physics"));
        c3.getSubject().add(new subject("Environmental Science"));
        c3.getSubject().add(new subject("Anatomy and Physiology"));
        c3.getSubject().add(new subject("Genetics"));
        c3.getSubject().add(new subject("Earth Science"));
        level1.add(c3);

        course c4 = new course("History", new ArrayList<>());
        c4.getSubject().add(new subject("World History"));
        c4.getSubject().add(new subject("American History"));
        c4.getSubject().add(new subject("European History"));
        c4.getSubject().add(new subject("Ancient Civilizations"));
        c4.getSubject().add(new subject("Modern History"));
        c4.getSubject().add(new subject("History of Art"));
        c4.getSubject().add(new subject("History of Science"));
        level1.add(c4);

        course c5 = new course("Physical Education", new ArrayList<>());
        c5.getSubject().add(new subject("Fitness"));
        c5.getSubject().add(new subject("Sports"));
        c5.getSubject().add(new subject("Health Education"));
        c5.getSubject().add(new subject("Nutrition"));
        c5.getSubject().add(new subject("Physical Therapy"));
        c5.getSubject().add(new subject("Athletics"));
        c5.getSubject().add(new subject("Yoga"));
        level1.add(c5);

        course c6 = new course("Computer Science", new ArrayList<>());
        c6.getSubject().add(new subject("Programming"));
        c6.getSubject().add(new subject("Data Structures"));
        c6.getSubject().add(new subject("Algorithms"));
        c6.getSubject().add(new subject("Software Engineering"));
        c6.getSubject().add(new subject("Database Management"));
        c6.getSubject().add(new subject("Networks"));
        c6.getSubject().add(new subject("Cybersecurity"));
        level1.add(c6);

        course c7 = new course("Fine Arts", new ArrayList<>());
        c7.getSubject().add(new subject("Drawing"));
        c7.getSubject().add(new subject("Painting"));
        c7.getSubject().add(new subject("Sculpture"));
        c7.getSubject().add(new subject("Photography"));
        c7.getSubject().add(new subject("Graphic Design"));
        c7.getSubject().add(new subject("Digital Art"));
        c7.getSubject().add(new subject("Printmaking"));
        level1.add(c7);

        // Level 2 courses
        course c8 = new course("Advanced Mathematics", new ArrayList<>());
        c8.getSubject().add(new subject("Advanced Algebra"));
        c8.getSubject().add(new subject("Advanced Calculus"));
        c8.getSubject().add(new subject("Complex Analysis"));
        c8.getSubject().add(new subject("Differential Equations"));
        c8.getSubject().add(new subject("Mathematical Modeling"));
        c8.getSubject().add(new subject("Topology"));
        c8.getSubject().add(new subject("Number Theory"));
        level2.add(c8);

        course c9 = new course("Advanced English Language", new ArrayList<>());
        c9.getSubject().add(new subject("Advanced Reading"));
        c9.getSubject().add(new subject("Advanced Writing"));
        c9.getSubject().add(new subject("Advanced Grammar"));
        c9.getSubject().add(new subject("Literary Analysis"));
        c9.getSubject().add(new subject("Speech and Debate"));
        c9.getSubject().add(new subject("Creative Writing Workshop"));
        c9.getSubject().add(new subject("English Literature"));
        level2.add(c9);

        course c10 = new course("Advanced Science", new ArrayList<>());
        c10.getSubject().add(new subject("Advanced Biology"));
        c10.getSubject().add(new subject("Advanced Chemistry"));
        c10.getSubject().add(new subject("Advanced Physics"));
        c10.getSubject().add(new subject("Biochemistry"));
        c10.getSubject().add(new subject("Quantum Mechanics"));
        c10.getSubject().add(new subject("Astrophysics"));
        c10.getSubject().add(new subject("Neuroscience"));
        level2.add(c10);

        course c11 = new course("Advanced History", new ArrayList<>());
        c11.getSubject().add(new subject("Modern History"));
        c11.getSubject().add(new subject("History of Science"));
        c11.getSubject().add(new subject("Political History"));
        c11.getSubject().add(new subject("Cultural History"));
        c11.getSubject().add(new subject("Historiography"));
        c11.getSubject().add(new subject("History of Technology"));
        c11.getSubject().add(new subject("Military History"));
        level2.add(c11);

        course c12 = new course("Advanced Physical Education", new ArrayList<>());
        c12.getSubject().add(new subject("Advanced Fitness"));
        c12.getSubject().add(new subject("Advanced Sports"));
        c12.getSubject().add(new subject("Sports Medicine"));
        c12.getSubject().add(new subject("Physical Education Theory"));
        c12.getSubject().add(new subject("Exercise Physiology"));
        c12.getSubject().add(new subject("Kinesiology"));
        c12.getSubject().add(new subject("Athletic Training"));
        level2.add(c12);

        course c13 = new course("Advanced Computer Science", new ArrayList<>());
        c13.getSubject().add(new subject("Advanced Programming"));
        c13.getSubject().add(new subject("Advanced Data Structures"));
        c13.getSubject().add(new subject("Advanced Algorithms"));
        course c14 = new course("Advanced Fine Arts", new ArrayList<>());
        c14.getSubject().add(new subject("Advanced Drawing"));
        c14.getSubject().add(new subject("Advanced Painting"));
        c14.getSubject().add(new subject("Advanced Sculpture"));
        c14.getSubject().add(new subject("Advanced Photography"));
        c14.getSubject().add(new subject("Advanced Graphic Design"));
        c14.getSubject().add(new subject("Advanced Digital Art"));
        c14.getSubject().add(new subject("Advanced Printmaking"));
        level2.add(c14);

        course c15 = new course("Advanced Music", new ArrayList<>());
        c15.getSubject().add(new subject("Advanced Music Theory"));
        c15.getSubject().add(new subject("Advanced Composition"));
        c15.getSubject().add(new subject("Advanced Performance"));
        c15.getSubject().add(new subject("Advanced Music Production"));
        c15.getSubject().add(new subject("Music History and Analysis"));
        c15.getSubject().add(new subject("Advanced Instrumental Studies"));
        c15.getSubject().add(new subject("Advanced Vocal Studies"));
        level2.add(c15);

        course c16 = new course("Advanced Science II", new ArrayList<>());
        c16.getSubject().add(new subject("Advanced Biology II"));
        c16.getSubject().add(new subject("Advanced Chemistry II"));
        c16.getSubject().add(new subject("Advanced Physics II"));
        c16.getSubject().add(new subject("Advanced Biochemistry"));
        c16.getSubject().add(new subject("Advanced Quantum Mechanics"));
        c16.getSubject().add(new subject("Astrophysics II"));
        c16.getSubject().add(new subject("Neuroscience II"));
        level3.add(c16);

        course c17 = new course("Advanced Computer Science II", new ArrayList<>());
        c17.getSubject().add(new subject("Advanced Programming II"));
        c17.getSubject().add(new subject("Advanced Data Structures II"));
        c17.getSubject().add(new subject("Advanced Algorithms II"));
        c17.getSubject().add(new subject("Advanced Software Engineering"));
        c17.getSubject().add(new subject("Advanced Database Management"));
        c17.getSubject().add(new subject("Advanced Networks"));
        c17.getSubject().add(new subject("Advanced Cybersecurity"));
        level3.add(c17);

        course c18 = new course("Advanced Fine Arts II", new ArrayList<>());
        c18.getSubject().add(new subject("Advanced Drawing II"));
        c18.getSubject().add(new subject("Advanced Painting II"));
        c18.getSubject().add(new subject("Advanced Sculpture II"));
        c18.getSubject().add(new subject("Advanced Photography II"));
        c18.getSubject().add(new subject("Advanced Graphic Design II"));
        c18.getSubject().add(new subject("Advanced Digital Art II"));
        c18.getSubject().add(new subject("Advanced Printmaking II"));
        level3.add(c18);

        course c19 = new course("Advanced Music II", new ArrayList<>());
        c19.getSubject().add(new subject("Advanced Music Theory II"));
        c19.getSubject().add(new subject("Advanced Composition II"));
        c19.getSubject().add(new subject("Advanced Performance II"));
        c19.getSubject().add(new subject("Advanced Music Production II"));
        c19.getSubject().add(new subject("Music History and Analysis II"));
        c19.getSubject().add(new subject("Advanced Instrumental Studies II"));
        c19.getSubject().add(new subject("Advanced Vocal Studies II"));
        level3.add(c19);

        course c20 = new course("Advanced Economics", new ArrayList<>());
        c20.getSubject().add(new subject("Advanced Microeconomics"));
        c20.getSubject().add(new subject("Advanced Macroeconomics"));
        c20.getSubject().add(new subject("Advanced International Economics"));
        c20.getSubject().add(new subject("Advanced Econometrics"));
        c20.getSubject().add(new subject("Advanced Development Economics"));
        c20.getSubject().add(new subject("Advanced Financial Economics"));
        c20.getSubject().add(new subject("Advanced Behavioral Economics"));
        level3.add(c20);

        course c21 = new course("Advanced Business Studies", new ArrayList<>());
        c21.getSubject().add(new subject("Advanced Entrepreneurship"));
        c21.getSubject().add(new subject("Advanced Marketing"));
        c21.getSubject().add(new subject("Advanced Finance"));
        c21.getSubject().add(new subject("Advanced Accounting"));
        c21.getSubject().add(new subject("Advanced Business Law"));
        c21.getSubject().add(new subject("Advanced Management"));
        c21.getSubject().add(new subject("Advanced Economics"));
        level3.add(c21);

        course c22 = new course("Advanced Foreign Language", new ArrayList<>());
        c22.getSubject().add(new subject("Advanced Spanish"));
        c22.getSubject().add(new subject("Advanced French"));
        c22.getSubject().add(new subject("Advanced German"));
        c22.getSubject().add(new subject("Advanced Mandarin"));
        c22.getSubject().add(new subject("Advanced Italian"));
        c22.getSubject().add(new subject("Advanced Japanese"));
        c22.getSubject().add(new subject("Advanced Russian"));
        level3.add(c22);
    }

    public List<course> getLevel1() {
        return level1;
    }

    public List<course> getLevel2() {
        return level2;
    }

    public List<course> getLevel3() {
        return level3;
    }

}
