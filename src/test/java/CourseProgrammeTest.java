package com.testpackage.seassignment1;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseProgrammeTest
{
    private CourseProgramme cp;
    private Module m, m1;

    @BeforeEach
    void setUp() throws Exception
    {
        cp = new CourseProgramme("BP1", new DateTime("2021-01-01T00:00:00Z"),
                new DateTime("2025-01-01T00:00:00Z"));
        m = new Module("EE451", "System on Chip Design I");
        m1 = new Module("EE347", "Embedded Systems Applications Programming");
    }

    @Test
    void addModule()
    {
        cp.addModule(m);
        cp.addModule(m1);
    }

    @Test
    void getModulesList()
    {
        cp.getModulesList();
    }
}