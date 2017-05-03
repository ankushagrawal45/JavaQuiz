package quiz.runner.ankush;

import java.util.Arrays;
import java.util.List;

import quiz.model.Ground;
import quiz.model.QuizDataProvider;
import quiz.model.Team;
public class QuizRunner {

	private QuizRunner() {

	}

	public static void main(String[] args) {

		List<Team> teams = QuizDataProvider.getTeams();
		System.out.println(teams);
		
		
		
		// 1
		teams.forEach(team -> System.out.println(team.getName() + ":" + team.getHomeGround()));
		
		
		
		// 2
		teams.sort((Team team1, Team team2) ->team1.getName().compareTo(team2.getName()));
		
		teams.forEach(team -> System.out.println(team.getName()));
		
		
		
		//3
		teams.sort((Team team1, Team team2)->team2.getName().compareTo(team1.getName()));
		
		teams.forEach(team -> System.out.println(team.getName()));
		
		
		
		//4
		List<Ground> homeGrounds = Arrays.asList(Ground.values());
		
		homeGrounds.sort((Ground ground1, Ground ground2)->ground1.name().compareTo(ground2.name()));
		homeGrounds.forEach(ground -> {
			System.out.println(ground.name());
		});
	}

}
