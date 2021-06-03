export class Trainer {

    trainerName: string = '';
    trainerEmail: string = '';
    track: string = '';

    constructor(trainerName: string, trainerEmail: string, track: string) {

        this.track = track;
        this.trainerEmail = trainerEmail;
        this.trainerName = trainerName;

    }

}
