import { Component, OnInit } from '@angular/core';
import { Task } from '../../task';
import { TASKLIST } from '../../task-list';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  tasks: Task[] = TASKLIST; // make a call to the REST Api

  constructor() { }

  ngOnInit(): void {

    
  }

  toggleReminder(task: Task){
    task.reminder = !task.reminder;

  }

}
