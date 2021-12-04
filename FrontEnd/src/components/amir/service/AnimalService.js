import axios from 'axios'

const ANIMAL_BASE_REST_API_URL = 'http://localhost:8090/animal';

class AnimalService{

    createAnimal(animal){
        return axios.post(ANIMAL_BASE_REST_API_URL, animal)
    }

    updateAnimalStatus(id, status){
        return axios.put(ANIMAL_BASE_REST_API_URL + '/' + id + '/' + status);
    }

    deleteAnimal(animalId){
        return axios.delete(ANIMAL_BASE_REST_API_URL + '/' + animalId);
    }

    getSearchAnimal(name, sex, species){
        return axios.get(ANIMAL_BASE_REST_API_URL + '/' + name + '/' + species + '/' + sex)
    }

    getAllAnimal(){
        return axios.get(ANIMAL_BASE_REST_API_URL);
    }

    getAllAnimalByStatus(status){
        return axios.get(ANIMAL_BASE_REST_API_URL + '/' + status);
    }


}

export default new AnimalService();