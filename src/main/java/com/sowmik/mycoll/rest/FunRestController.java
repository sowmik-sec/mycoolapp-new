package com.sowmik.mycoll.rest;

import org.apache.coyote.http11.upgrade.UpgradeServletOutputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.team}")
    private String teamName;

    // expose new endpoint for "teaminfo"

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }
    @GetMapping("/fortune")
    public String setDailyFortune() {
        return "Today is your lucky day.";
    }
}
