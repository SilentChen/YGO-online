package cn.com.helloclyde.ygoService.mapper.model;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.win_game
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    private Integer winGame;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.all_game
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    private Integer allGame;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.win_game
     *
     * @return the value of user.win_game
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public Integer getWinGame() {
        return winGame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.win_game
     *
     * @param winGame the value for user.win_game
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public void setWinGame(Integer winGame) {
        this.winGame = winGame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.all_game
     *
     * @return the value of user.all_game
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public Integer getAllGame() {
        return allGame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.all_game
     *
     * @param allGame the value for user.all_game
     *
     * @mbggenerated Fri Mar 24 22:48:58 CST 2017
     */
    public void setAllGame(Integer allGame) {
        this.allGame = allGame;
    }
}