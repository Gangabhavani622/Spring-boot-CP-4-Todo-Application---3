/*
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.todo.model;

import javax.persistence.*;

@Entity
@Table(name="todolist")
public class Todo{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="todo")
    private String todo;
    @Column(name="priority")
    private String priority;
    @Column(name="status")
    private String status;

    public Todo(){}

    public Todo(int id, String todo, String priority, String status){
        this.id=id;
        this.todo=todo;
        this.priority=priority;
        this.status=status;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setTodo(String todo){
        this.todo=todo;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public void setPriority(String priority){
        this.priority=priority;
    }

    public int getId(){
        return this.id;
    }

    public String getTodo(){
        return this.todo;
    }

    public String getStatus(){
        return this.status;
    }

    public String getPriority(){
        return this.priority;
    }
    
}