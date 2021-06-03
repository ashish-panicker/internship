import { Injectable } from '@angular/core';
import { Trainer } from '../models/trainer';
import { HttpClient } from '@angular/common/http';
import { Team } from '../models/team';

@Injectable({
  providedIn: 'root'
})
export class TrainerService {

  trainers: Trainer[] = [];

  constructor(private http: HttpClient) { }


  create(trainer: Trainer) {
    this.trainers.push(trainer);
  }

  readAll() {
    return this.trainers;
  }

  getTeamData() {
    this.http.get<Team>('http://localhost:9000/ipl-api/teams/Rajasthan%20Royals')
      .subscribe(resp => console.log(resp));
  }


}
