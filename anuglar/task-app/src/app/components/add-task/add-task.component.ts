import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  text:string = 'Empty reminder';
  day:string = ' Not defined';
  reminder:boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

}
