import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Trainer } from 'src/app/models/trainer';
import { TrainerService } from 'src/app/services/trainer.service';


@Component({
  selector: 'app-add-trainer',
  templateUrl: './add-trainer.component.html',
  styleUrls: ['./add-trainer.component.css']
})
export class AddTrainerComponent implements OnInit {

  trainerForm = new FormGroup({
    trainerName: new FormControl('', [Validators.required, Validators.minLength(3)]),
    trainerEmail: new FormControl('', [Validators.required, Validators.email]),
    track: new FormControl('', [Validators.required, Validators.minLength(3)])
  });

  trainer: Trainer = new Trainer('', '', '');

  constructor(private trainerService: TrainerService) { }

  ngOnInit(): void {
  }

  trainerFormSubmit() {
    this.trainer = this.trainerForm.value;
    console.log(this.trainer);

    this.trainerService.create(this.trainer);

    this.trainerService.readAll().forEach((t) => console.log(t));

    this.trainerService.getTeamData();
  }
}
