package at.htl.sportplatzverwaltung.entity;

import javax.persistence.*;

@Entity
@NamedQueries(@NamedQuery(name = "GetAllTeams", query = "select t from Team t"))
public class Team {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TeamId;
    private int noOfPlayers;
    private int noOfTrainers;
    private String teamname;


    public Team (int noOfPlayers, int noOfTrainers, String teamname){
        this.noOfPlayers = noOfPlayers;
        this.noOfTrainers = noOfTrainers;
        this.teamname = teamname;
    }


    public Team(){

    }

    public Long getTeamId() {
        return TeamId;
    }

    public void setTeamId(Long teamId) {
        TeamId = teamId;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public int getNoOfTrainers() {
        return noOfTrainers;
    }

    public void setNoOfTrainers(int noOfTrainers) {
        this.noOfTrainers = noOfTrainers;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
}
