def call(String url, String branch){
  echo "📥 Cloning the repository..."
  git branch: "${branch}", url: "${url}"
}
