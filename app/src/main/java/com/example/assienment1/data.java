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
        course c8 = new course(" Mathematics I", new ArrayList<>());
        c8.getSubject().add(new subject(" Algebra I"));
        c8.getSubject().add(new subject(" Calculus I"));
        c8.getSubject().add(new subject("Complex Analysis"));
        c8.getSubject().add(new subject("Differential Equations"));
        c8.getSubject().add(new subject("Mathematical Modeling"));
        c8.getSubject().add(new subject("Topology"));
        c8.getSubject().add(new subject("Number Theory"));
        level2.add(c8);

        course c9 = new course(" English Language I", new ArrayList<>());
        c9.getSubject().add(new subject(" Reading I"));
        c9.getSubject().add(new subject(" Writing I"));
        c9.getSubject().add(new subject(" Grammar I"));
        c9.getSubject().add(new subject("Literary Analysis"));
        c9.getSubject().add(new subject("Speech and Debate"));
        c9.getSubject().add(new subject("Creative Writing Workshop"));
        c9.getSubject().add(new subject("English Literature"));
        level2.add(c9);

        course c10 = new course(" Science I", new ArrayList<>());
        c10.getSubject().add(new subject("Biology I"));
        c10.getSubject().add(new subject("Chemistry I"));
        c10.getSubject().add(new subject("Physics I"));
        c10.getSubject().add(new subject("Biochemistry I"));
        c10.getSubject().add(new subject("Quantum Mechanics I"));
        c10.getSubject().add(new subject("Astrophysics I"));
        c10.getSubject().add(new subject("Neuroscience I"));
        level2.add(c10);

        course c11 = new course(" History I", new ArrayList<>());
        c11.getSubject().add(new subject("Modern History"));
        c11.getSubject().add(new subject("History of Science"));
        c11.getSubject().add(new subject("Political History"));
        c11.getSubject().add(new subject("Cultural History"));
        c11.getSubject().add(new subject("Historiography"));
        c11.getSubject().add(new subject("History of Technology"));
        c11.getSubject().add(new subject("Military History"));
        level2.add(c11);

        course c12 = new course("Physical Education I", new ArrayList<>());
        c12.getSubject().add(new subject("Fitness I"));
        c12.getSubject().add(new subject("Sports I"));
        c12.getSubject().add(new subject("Sports Medicine"));
        c12.getSubject().add(new subject("Physical Education Theory"));
        c12.getSubject().add(new subject("Exercise Physiology"));
        c12.getSubject().add(new subject("Kinesiology"));
        c12.getSubject().add(new subject("Athletic Training"));
        level2.add(c12);

        course c13 = new course("Computer I", new ArrayList<>());
        c13.getSubject().add(new subject("Advanced Programming "));
        c13.getSubject().add(new subject("Data Structures I"));
        c13.getSubject().add(new subject(" Algorithms I"));
        course c14 = new course("Fine Arts I", new ArrayList<>());
        c14.getSubject().add(new subject("Drawing I"));
        c14.getSubject().add(new subject("Painting I"));
        c14.getSubject().add(new subject("Sculpture I"));
        c14.getSubject().add(new subject("Photography I"));
        c14.getSubject().add(new subject("Graphic Design I"));
        c14.getSubject().add(new subject("Digital Art I"));
        c14.getSubject().add(new subject("Printmaking I"));
        level2.add(c14);

        course c15 = new course("Music I", new ArrayList<>());
        c15.getSubject().add(new subject(" Music Theory I"));
        c15.getSubject().add(new subject(" Composition I"));
        c15.getSubject().add(new subject("Performance I"));
        c15.getSubject().add(new subject(" Music Production I"));
        c15.getSubject().add(new subject("Music History and Analysis"));
        c15.getSubject().add(new subject("Instrumental Studies I"));
        c15.getSubject().add(new subject("Vocal Studies I"));
        level2.add(c15);

        course c16 = new course(" Science II", new ArrayList<>());
        c16.getSubject().add(new subject(" Biology II"));
        c16.getSubject().add(new subject(" Chemistry II"));
        c16.getSubject().add(new subject(" Physics II"));
        c16.getSubject().add(new subject(" Biochemistry"));
        c16.getSubject().add(new subject(" Quantum Mechanics"));
        c16.getSubject().add(new subject("Astrophysics II"));
        c16.getSubject().add(new subject("Neuroscience II"));
        level3.add(c16);

        course c17 = new course("Computer  II", new ArrayList<>());
        c17.getSubject().add(new subject(" Programming II"));
        c17.getSubject().add(new subject(" Data Structures II"));
        c17.getSubject().add(new subject(" Algorithms II"));
        c17.getSubject().add(new subject(" Software Engineering"));
        c17.getSubject().add(new subject(" Database Management"));
        c17.getSubject().add(new subject(" Networks"));
        c17.getSubject().add(new subject(" Cybersecurity"));
        level3.add(c17);

        course c18 = new course(" Fine Arts II", new ArrayList<>());
        c18.getSubject().add(new subject(" Drawing II"));
        c18.getSubject().add(new subject(" Painting II"));
        c18.getSubject().add(new subject(" Sculpture II"));
        c18.getSubject().add(new subject(" Photography II"));
        c18.getSubject().add(new subject(" Graphic Design II"));
        c18.getSubject().add(new subject(" Digital Art II"));
        c18.getSubject().add(new subject(" Printmaking II"));
        level3.add(c18);

        course c19 = new course(" Music II", new ArrayList<>());
        c19.getSubject().add(new subject(" Music Theory II"));
        c19.getSubject().add(new subject(" Composition II"));
        c19.getSubject().add(new subject(" Performance II"));
        c19.getSubject().add(new subject(" Music Production II"));
        c19.getSubject().add(new subject("Music History and Analysis II"));
        c19.getSubject().add(new subject(" Instrumental Studies II"));
        c19.getSubject().add(new subject(" Vocal Studies II"));
        level3.add(c19);

        course c20 = new course(" Economics", new ArrayList<>());
        c20.getSubject().add(new subject(" Microeconomics"));
        c20.getSubject().add(new subject(" Macroeconomics"));
        c20.getSubject().add(new subject(" International Economics"));
        c20.getSubject().add(new subject(" Econometrics"));
        c20.getSubject().add(new subject(" Development Economics"));
        c20.getSubject().add(new subject(" Financial Economics"));
        c20.getSubject().add(new subject(" Behavioral Economics"));
        level3.add(c20);

        course c21 = new course(" Business Studies I", new ArrayList<>());
        c21.getSubject().add(new subject(" Entrepreneurship I"));
        c21.getSubject().add(new subject(" Marketing I"));
        c21.getSubject().add(new subject(" Finance I"));
        c21.getSubject().add(new subject(" Accounting I"));
        c21.getSubject().add(new subject(" Business Law I"));
        c21.getSubject().add(new subject(" Management I"));
        c21.getSubject().add(new subject(" Economics I"));
        level3.add(c21);

        course c22 = new course(" Foreign Language I", new ArrayList<>());
        c22.getSubject().add(new subject(" Spanish I"));
        c22.getSubject().add(new subject(" French I"));
        c22.getSubject().add(new subject(" German I"));
        c22.getSubject().add(new subject(" Mandarin I"));
        c22.getSubject().add(new subject(" Italian I"));
        c22.getSubject().add(new subject(" Japanese I"));
        c22.getSubject().add(new subject(" Russian I"));
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
