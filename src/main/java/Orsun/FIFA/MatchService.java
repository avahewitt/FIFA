package Orsun.FIFA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchRepo mrepo;
    private List<Team> teams = new ArrayList<Team>();

    public List<Matches> getAllMatches(){

        return mrepo.findAll();
    }

    public List<Team> getAllTeams(){

        return teams;
    }
    private void playMatch(Team home, Team other, int goals, int oGoals){
        if (oGoals > goals){
            home.setLosses(home.getLosses()+1);
            other.setWins(other.getWins()+1);

        }
        else{

        }

    }
}
