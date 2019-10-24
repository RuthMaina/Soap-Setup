package com.example.soap;

import localhost.universities.University;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class UniversityRepository {
    private static final Map<String, University> university = new HashMap<>();

    @PostConstruct
    public void initData() {
        University strathmore = new University();
        strathmore.setName("Strathmore");
        strathmore.setLocation("Ole-Sangale");
        strathmore.setYearFounded(1963);

        university.put(strathmore.getName(), strathmore);

        University jkuat = new University();
        strathmore.setName("JKUAT");
        strathmore.setLocation("Juja");
        strathmore.setYearFounded(1932);

        university.put(jkuat.getName(), jkuat);

        University uon = new University();
        strathmore.setName("UON");
        strathmore.setLocation("Westlands");
        strathmore.setYearFounded(1950);

        university.put(uon.getName(), uon);
    }

    public University getUniversityByName (String name) {
        return university.get(name);
    }
}
