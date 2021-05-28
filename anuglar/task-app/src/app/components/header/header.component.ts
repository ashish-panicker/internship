import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  title: string = 'Task Manager Angular';

  constructor() { }

  ngOnInit(): void {
  }

  createTask(): void {
    console.log('task created')
  }

  deleteTask(): void {
    console.log('task deleted')
  }
}
