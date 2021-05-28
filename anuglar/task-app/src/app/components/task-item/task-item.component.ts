import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Task } from '../../task';

@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css']
})
export class TaskItemComponent implements OnInit {

  @Input() task: Task;
  @Output() onToggleReminder: EventEmitter<Task> = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  onToggle(task: Task) {
    this.onToggleReminder.emit(task);
  }

}
