package edu.dev.api.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	private Integer position;
	
	public Belonging () {
		
	}

	public Belonging(Game game, GameList gameList, Integer position) {
		id.setGame(game);
		id.setGameList(gameList);
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
