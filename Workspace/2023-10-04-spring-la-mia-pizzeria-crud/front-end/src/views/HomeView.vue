<template>
  <main>
    <h1>Pizze</h1>    
    <button 
      v-if="!showCreateForm"
      @click="showCreateForm = true"
    >CREATE NEW PIZZA</button>
    <form
      v-if="showCreateForm"
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
const showCreateForm = ref(true); // DEBUG: ref(false); !!
const emptyPizza = {
  name: null,
  description: null,
  photo: null,
  price: null
};
const newPizza = ref({...emptyPizza});

onMounted(() => {

  axios.get(API_URL + "/pizzas")
       .then(res => {

          const data = res.data;
          pizze.value = data;
        })
       .catch(err => console.log(err));
});

</script>