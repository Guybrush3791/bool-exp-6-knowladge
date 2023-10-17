<template>
  <main>
    <h1>Pizze</h1>    
    <button 
      v-if="!showCreateForm"
      @click="showCreateForm = true"
    >CREATE NEW PIZZA</button>
    <form
      v-if="showCreateForm"
      @submit.prevent="storePizza"
    >
      <label for="name">Name</label>
      <br>
      <input type="text" name="name" v-model="newPizza.name" >
      <br>
      <label for="description">Description</label>
      <br>
      <input type="text" name="description" v-model="newPizza.description" >
      <br>
      <label for="photo">Photo</label>
      <br>
      <input type="text" name="photo" v-model="newPizza.photo" >
      <br>
      <label for="price">Price</label>
      <br>
      <input type="number" name="price" v-model="newPizza.price" >
      <br><br>
      <input type="submit" value="CREATE">
      <button @click="clearCreate">CANCEL</button>
    </form>
    <div
      v-if="!showCreateForm"
    >
      <ul>
        <li
          v-for="pizza in pizze"
          :key="pizza.id"
        >
          {{ pizza.name }}
          <button
            @click="pizzaDelete(pizza.id)"
          >X</button>
        </li>
      </ul>
    </div>
  </main>
</template>

<script setup>
import { onMounted, ref } from 'vue';
import axios from "axios";

const API_URL = "http://localhost:8080/api/v1.0"

const pizze = ref(null);
const showCreateForm =ref(false);
const emptyPizza = {
  name: null,
  description: null,
  photo: null,
  price: null
};
const newPizza = ref({...emptyPizza});

function clearCreate() {

  showCreateForm.value = false;
  newPizza.value = ref({...emptyPizza});
}
function storePizza() {

  axios.post(API_URL + "/pizzas", newPizza.value)
       .then(res => {

        const data = res.data;
        
        clearCreate();
       })
       .catch(err => console.log(err));
}
function pizzaDelete(id) {

  axios.delete(API_URL + "/pizzas/" + id)
       .then(res => {

          getAllPizzas();        
       })
       .catch(err => console.log(err))
}
function getAllPizzas() {

  axios.get(API_URL + "/pizzas")
       .then(res => {

          const data = res.data;
          pizze.value = data;
        })
       .catch(err => console.log(err));
}
onMounted(() => {

   getAllPizzas();
});

</script>