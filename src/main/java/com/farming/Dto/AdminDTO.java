package com.farming.Dto;

public class AdminDTO {
    private String username;
    private String email;
    private String role;

    // Constructor
    public AdminDTO(String username, String email, String role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    // Getters and Setters
    
}
