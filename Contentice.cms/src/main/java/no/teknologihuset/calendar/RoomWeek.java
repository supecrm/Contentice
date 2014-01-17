package no.teknologihuset.calendar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhsmbp on 12/6/13.
 */
public class RoomWeek {
    private String id;
    private Integer roomWeek;
    private Integer roomYear;
    private Integer roomMonth;
    private List<RoomDay> roomDays;

    RoomWeek() {
        roomDays = new ArrayList<RoomDay>();
    }

    public RoomWeek(String id, Integer roomWeek, Integer roomMonth, Integer roomYear) {
        this();
        this.id = id;
        this.roomWeek = roomWeek;
        this.roomMonth = roomMonth;
        this.roomYear = roomYear;
    }

    public RoomWeek(RoomWeek oldRoomWeek) {
        this(oldRoomWeek.getId(),
                oldRoomWeek.getRoomWeek(),
                oldRoomWeek.getRoomMonth(),
                oldRoomWeek.getRoomYear());
    }

    public RoomDay getRoomDay(Integer dayOfWeek) {
        RoomDay roomDay = null;

        for (RoomDay rd : roomDays) {
            if (rd.getDayOfWeek() != null && dayOfWeek != null && rd.getDayOfWeek().intValue() == dayOfWeek.intValue()) {
                roomDay = rd;
            }
        }

        return roomDay;
    }

    public void addRoomDay(RoomDay rd) {
        roomDays.add(rd);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRoomWeek() {
        return roomWeek;
    }

    public void setRoomWeek(Integer roomWeek) {
        this.roomWeek = roomWeek;
    }

    public List<RoomDay> getRoomDays() {
        return roomDays;
    }

    public void setRoomDays(List<RoomDay> roomDays) {
        this.roomDays = roomDays;
    }

    public Integer getRoomYear() {
        return roomYear;
    }

    public void setRoomYear(Integer roomYear) {
        this.roomYear = roomYear;
    }

    public Integer getRoomMonth() {
        return roomMonth;
    }

    public void setRoomMonth(Integer roomMonth) {
        this.roomMonth = roomMonth;
    }
}